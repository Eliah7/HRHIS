package com.dhis.hrhis.Models;

import java.sql.Timestamp;

public class Hris_user {
    private int _id;
    private Integer _organisationunit_id;
    private String _username;
    private String _username_canonical;
    private String _email;
    private String _email_canonical;
    private int _enabled;
    private String _salt;
    private String _password;
    private Timestamp _last_login;
    private int _locked;
    private int _expired;
    private Timestamp _expires_at;
    private String _confirmation_token = "NULL::character varying";
    private Timestamp _password_requested_at;
    private String _roles;
    private int _credentials_expired;
    private Timestamp _credentials_expire_at;
    private String _uid;
    private String _phonenumber = "NULL::character varying";
    private String _jobtitle = "NULL::character varying";
    private String _firstname = "NULL::character varying";
    private String _middlename = "NULL::character varying";
    private String _surname = "NULL::character varying";
    private Timestamp _datecreated;
    private Timestamp _lastupdated;
    private Timestamp _deletedat;
    private String _description;
}