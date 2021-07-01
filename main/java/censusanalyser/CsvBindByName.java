package censusanalyser;

public @interface CsvBindByName {

	String column();

	boolean required();

}
