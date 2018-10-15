package database.CrimeDbSchema;

/**
 * 项目名：CriminalIntent
 * 包名：  database.CrimeDbSchema
 * 文件名：CrimeDbSchema
 * Created by liushengjie on 2018/10/11.
 * 描述：
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
