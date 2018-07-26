import java.sql.Timestamp;

public class Hris_record_history {
    private int _id;
    private Integer _record_id;
    private Integer _field_id;
    private String _uid;
    private String _history;
    private String _reason = "NULL::character varying";
    private Timestamp _startdate;
    private String _username;
    private Timestamp _datecreated;
    private Timestamp _lastupdated;
    private Timestamp _enddate;
    private String _entitled_payment = "NULL::character varying";
}