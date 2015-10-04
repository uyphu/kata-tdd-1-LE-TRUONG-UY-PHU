

public class Calculate {
	
	public static int add(String numbers) {
		try {
			if (numbers != null && numbers.length() > 0) {
				int sum = 0;
				String[] arrLine = numbers.split("\n");
				for (int i = 0; i < arrLine.length; i++) {
					String[] array = arrLine[i].split("[,]{1,}|[;]{1,}|[%]{1,}|[*]{1,}");
					for (int j = 0; j < array.length; j++) {
						int value = Integer.parseInt(array[j]);
						value = value > 1000 ? 0 : value;
						sum += value;
					}
				}
				
				return sum;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

}
