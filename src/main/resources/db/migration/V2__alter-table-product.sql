ALTER TABLE product ADD COLUMN active BOOLEAN;

-- Define um valor para os registros já existentes
UPDATE product SET active = TRUE;