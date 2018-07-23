package com.example.android.invetoryapp.data;

import android.provider.BaseColumns;

public final class ProductContract {

    private ProductContract(){

    }

    public static final class ProductEntry implements BaseColumns {
        /**
         * Name of database table for products
         */
        public  final static String TABLE_NAME = "book";

        /**
         * Unique ID number for the pet (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the book.
         *
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_NAME = "name";

        /**
         * Price of the Book.
         *
         * Type: FLOAT
         */
        public final static String COLUMN_PRICE = "price";

        /**
         * Quantity availabe of Book
         *
         * Type: Integer
         */
        public final static String COLUMN_QUANTITY = "quantity";

        /**
         * Name of the Supplier of Book.
         *
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_NAME = "supplierName";

        /**
         * Tel Number of the Supplier of Book.
         *
         * Type: Integer
         */
        public final static String COLUMN_SUPPLIER_TEL = "supplierTel";
        }
}
