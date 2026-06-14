CREATE TABLE books (
  id INTEGER,
  title TEXT,
  author TEXT
);
-- Do not modify above this line --

Alter table books add column published_year Integer;
Alter table books rename column id  to isbn ;
Alter table books drop column author ;








-- Do not modify below this line --
SELECT column_name, data_type, column_default
FROM information_schema.columns
WHERE table_name = 'books'
ORDER BY column_name;
