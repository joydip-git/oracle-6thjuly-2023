SET SERVEROUTPUT ON;
DECLARE
    v_choice char(1);
    v_message varchar2(100);
BEGIN       
    v_choice :='F';
    
    CASE v_choice
    WHEN 'A' THEN
     v_message := 'call add function';
    WHEN 'S' THEN
     v_message := 'call subtract function';
    WHEN 'M' THEN
     v_message := 'call multiply function';
    WHEN 'D' THEN    
     v_message := 'call divide function';   
   
    ELSE
      --v_message :='incorrect choice';
      --GOTO incorrect_choice;
      RAISE CASE_NOT_FOUND;      
    END CASE;
    
    <<incorrect_choice>>
    DBMS_OUTPUT.PUT_LINE('enter correct choice.');
    
    DBMS_OUTPUT.PUT_LINE(v_message);
    
    EXCEPTION
        WHEN CASE_NOT_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('incorrect choice');
END;