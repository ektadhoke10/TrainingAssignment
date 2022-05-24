package multilevel_Inheritance;

public class VeritiesOfMango extends Mango {
	
	public void verityOfMangoesInMaharashtras(String strName) {
		
		String strInfo;
		System.out.println(strName + " : ");
		System.out.println("--------------------------------------");
		
	    switch (strName) {
	   
	    case "Mankurad":
	    	strInfo = "Although Mankurad is extensively produced in Goa, its orchards are found in Ratnagiri and Sindhudurg.\n This delicious fruit is yellow and oblong and develops black spots as it ripens.";
	        break;
	        
	      case "Kesar":
	    	  strInfo = "Kesar is a small to medium fruit with a roundish shape and a distinctly curved tip.<br> It has been named after saffron or kesar because of its orange hue.\n It is considered to be one of the rarest mangoes.\n It is harvested at the beginning of the season and found mostly in North Konkan, Dhule, Jalgaon, and Nandurbrar in Nasik district, Aurangabad district and, Marathwada. ";
	        break;

	      case "Vanraj":
	    	  strInfo = "Vanraj has purple skin and brilliant yellow flesh, with a sweet and sour flavour profile.\n It also has a good shelf life and is available in the middle of the season.\n It is found mostly in the North Konkan region and Nasik district.";
	        break;

	      case "Rajapuri":
	    	  strInfo = "Rajapuri is the largest of the Indian mango varieties and has an attractive combination of smooth and unblemished yellow, orange and red skin. \nIts strong floral aroma and sweet flavor make it one of the most popular table and cooking mangoes.\n It is also good for pickles.\n It is found mostly in the Aurangabad district.";
	        break;

	      case "Alphonso" :
	    	  strInfo = " Alphonso is also known by different names in different regions, such as Badami, Gundu, Khader, Appas, Happus, and Kagdi Hapus.\n It has long been one of the world’s most popular fruits and is exported to various countries. \n It has a rich, creamy, delicate, non-fibrous, and juicy pulp. <br>The original Indian mango breeds were juicy, with lots of fibre, and had a short shelf-life.\n Alphonso became the king of mangoes due to their attractive colour and delicious taste that lasts long.  ";
	        break;
	      
	      default:
	    	  strInfo = "This verity of mango is not in maharashtra";
	        break;

	    }
	    System.out.println(strInfo);
	  }
	}
	

