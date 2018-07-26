import java.sql.Timestamp;

public class Ext_log_entries {
    private int _id;
    private String _action;
    private Timestamp _logged_at;
    private String _object_id = "NULL::character varying";
    private String _object_class;
    private int _version;
    private String _data;
    private String _username = "NULL::character varying";
}