SET SERVEROUTPUT ON;
DECLARE
    message VARCHAR2(25) := 'welcome to pl-sql';
    div_result number;
    first_val NUMBER := 10;
    second_val NUMBER := 0;
BEGIN
    DBMS_OUTPUT.put_line(message);
    div_result := first_val/second_val;
    EXCEPTION
        WHEN ZERO_DIVIDE THEN
            DBMS_OUTPUT.put_line(SQLERRM);
END;

--select * from employees;