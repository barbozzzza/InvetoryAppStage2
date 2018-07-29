package com.example.android.invetoryapp.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class ProductContract {

    private ProductContract() {
    }

    // Content Authority
    public static final String CONTENT_AUTHORITY = "com.example.android.invetoryapp";
    // Path for Each of the tables
    public static final String PATH_PRODUCT = "product";
    // Base URI shared across every URI associated with product Contract
    static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final class ProductEntry implements BaseColumns {

        /**
         * Complete URI for this Database table
         */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PRODUCT);

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of products.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCT;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single product.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCT;

        /**
         * Name of database table for products
         */
        public final static String TABLE_NAME = "product";

        /**
         * Unique ID number for the product (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the product.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME = "name";

        /**
         * Price of the product.
         * <p>
         * Type: REAL
         */
        public final static String COLUMN_PRICE = "price";

        /**
         * Quantity available of product
         * <p>
         * Type: Integer
         */
        public final static String COLUMN_QUANTITY = "quantity";

        /**
         * Name of the Supplier of product.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_NAME = "supplierName";

        /**
         * Tel Number of the Supplier of product.
         * <p>
         * Type: Integer
         */
        public final static String COLUMN_SUPPLIER_TEL = "supplierTel";
    }
}
