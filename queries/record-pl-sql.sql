set serveroutput on;
declare
		TYPE r_product_row
		IS
			RECORD
			(
				productname products.product_name%TYPE,
				price products.list_price%TYPE
			);		
		cursor c_record is
		select product_name, list_price from products where product_id between 1 and 10;
        l_record r_product_row;
	begin
		open c_record;
		loop
			fetch c_record into l_record;
			exit when c_record%notfound;
			dbms_output.put_line(l_record.productname||', '||l_record.price);
		end loop;
		close c_record;
	end;
    

set serveroutput on;
declare
		TYPE r_product_stat_row
		IS
			RECORD
			(				
				maxprice products.list_price%TYPE,
                minprice products.list_price%TYPE,
                avgprice products.list_price%TYPE
			);		
        l_record r_product_stat_row;
	begin
            select max(list_price), min(list_price), avg(list_price) into l_record from products;
			dbms_output.put_line(l_record.avgprice||', '||l_record.maxprice||', '||l_record.minprice);
	end;
    