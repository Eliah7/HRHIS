import java.sql.Timestamp;

public class Hris_leave_type {
    private int _id;
    private Integer _field_id;
    private String _name;
    private String _uid;
    private Integer _maximum_days;
    private String _limit_applicable = "NULL::character varying";
    private String _description;
    private String _payment_applicable = "NULL::character varying";
    private Timestamp _datecreated;
    private Timestamp _lastupdated;
}