create procedure add_numbers(first IN number, second IN number, result OUT number)
is
begin
    result := first +second;
end;

create procedure calculate_square_area(side IN OUT number) IS
begin
    side := side * side;
end;

--set serveroutput on;
declare 
    l_first number;
    l_second number;
    l_result number;
    l_side number := 12;
begin
      l_first :=10;
      l_second :=20;
      
      -- positional notation
      --add_numbers(l_first, l_second, l_result);
      
      --named notation
      add_numbers(second => l_second, result=>l_result, first=>l_first);
      dbms_output.put_line('ADDRESULT: '||l_result);     
      --calculate_square_area(l_side);    
      --dbms_output.put_line(l_side);
end;
/