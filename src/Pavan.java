
	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class Pavan {
		
			static int l_int_no_of_target_rec_count = 0;
		    static int no_of_coulumns = 0;
		    static FileWriter fileWriter = null;
		    public static void main(String[] args) throws IOException {

		        String sourcePath = "C:\\Users\\SIVAMUNI\\ShareTrackSheet.csv";
		        String strRow = "";
		        String splitBy = ",";
		        String targetPath = "C:\\Users\\SIVAMUNI\\ShareTrackSheet.csv";
		        
		        fileWriter = new FileWriter(targetPath);
		        
		        try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
		        	if ((strRow = br.readLine())!=null) {
		        		 String[] strSKU_Data = strRow.split(splitBy);
		        		 no_of_coulumns = strSKU_Data.length;
		        	}
		        			
		          } catch (IOException e) {
		            e.printStackTrace();
		        }
		  
		        FileInputStream fis = new FileInputStream(sourcePath);
		        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
			
			        List<List<String>> listOfList = new ArrayList<>();
			
			        String line = reader.readLine();
			        String[] column = line.split(",");
			
			        //initial
			
			        for(int i = 0; i<column.length;i++){
			            listOfList.add(new ArrayList<String>());
			        }
			        int noOfRows=0;
			        while(line != null){
			            column = line.split(",");
			            noOfRows = noOfRows + 1;
			            for(int i = 0; i<column.length-1;i++){
			                listOfList.get(i).add(column[i]);
			            }
			
			            line = reader.readLine();
			        }

			    reader.close();
		        for (int rows= 0; rows < 1; rows++ )
		        {
			     	String rowVlaues = "";
			     	String [] l_obj_row_data = null;
			     	
			         for (int i = 0; i < listOfList.size(); i++) { 
			         	 rowVlaues= rowVlaues + listOfList.get(i).get(rows)+",";
			         }

			     	l_obj_row_data = rowVlaues.split(",");
			     	List<String>  itemList =  Arrays.asList(l_obj_row_data); 

			     	l_int_no_of_target_rec_count = itemList.indexOf("Sales Organization"); 

		         } 
		        
		        
		       for (int rows= 0; rows < noOfRows; rows++ )
		       {
		    	String rowVlaues = "";
		        for (int i = 0; i < listOfList.size(); i++) { 
		        	 rowVlaues= rowVlaues + listOfList.get(i).get(rows)+",";
		        }
		        //System.out.println(rowVlaues);
		        getRowData(rowVlaues);
		        } 
		    }
		    
		    private static void getRowData(String rowVlaues) {
		    	String [] l_obj_row_data = null;
		    	l_obj_row_data = rowVlaues.split(",");
		    	//System.out.println(l_int_no_of_target_rec_count);
		    	String l_str_taget_row = "";
		    	for(int i = 0;i< l_obj_row_data.length;i++ ) {
		    		l_str_taget_row = l_str_taget_row + l_obj_row_data[i] +",";
		    		
		    
		    	}
		    	String [] temp2 = l_str_taget_row.split(",");
		    	String [] temp1 = l_str_taget_row.split(",")[l_int_no_of_target_rec_count].split("\\|");
		    	
		    	generateOutputFile(temp2,temp1.length);

		    }

			private static void generateOutputFile(String[] temp2, int length) {
				// TODO Auto-generated method stub
				
				for(int i=0;i< length;i++) {
					String l_str_taget_row = "";
					for(int j = 0;j< temp2.length;j++ ) {
					
			     		if (temp2[j].contains("|")) {
			    			String[] temp = temp2[j].split("\\|");
			    			l_str_taget_row = l_str_taget_row + getvalue(temp,i) + ",";
			    		}
			    		else {
			    			l_str_taget_row = l_str_taget_row + temp2[j] + ",";
			    		}
					}
					//System.out.println(l_str_taget_row);
					try {
						fileWriter.write(l_str_taget_row);
						fileWriter.append("\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally {
			            
			            try {
			                fileWriter.flush();
			            } catch (IOException e) {
			                System.out.println("Error while flushing/closing fileWriter !!!");
			                e.printStackTrace();
			            }
					}
				}
					
				
			}

			private static String getvalue(String[] strVlaue, int i) {
				// TODO Auto-generated method stub
				if (i < strVlaue.length) {
					//System.out.println(strVlaue[i]);
					return strVlaue[i];
				}
				else 
					return "";
			}	

	}



