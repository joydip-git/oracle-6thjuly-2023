CREATE TABLE REGIONS(
region_id NUMBER(3),
region_name VARCHAR2(3) NOT NULL,
PRIMARY KEY(region_id)
);
--INSERT INTO REGIONS(region_id,region_name) VALUES(1,'BLR');
--INSERT INTO REGIONS(region_id,region_name) VALUES(2,'MUM');
--INSERT INTO REGIONS(region_id,region_name) VALUES(3,'CHN');

--SELECT
--    "R1"."REGION_ID"   "REGION_ID",
--    "R1"."REGION_NAME" "REGION_NAME"
--FROM
--    "SYSTEM"."REGIONS" "R1";

--SELECT region_id, region_name from regions