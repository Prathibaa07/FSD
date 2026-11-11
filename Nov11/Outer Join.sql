use nov11;

SELECT * FROM class LEFT OUTER JOIN info ON class.ID = info.ID;

SELECT * FROM class RIGHT OUTER JOIN info ON class.ID = info.ID;

SELECT * FROM class LEFT OUTER JOIN info ON class.ID = info.ID UNION SELECT * FROM class RIGHT OUTER JOIN info ON class.ID = info.ID;