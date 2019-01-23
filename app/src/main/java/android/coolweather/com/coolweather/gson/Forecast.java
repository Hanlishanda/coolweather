package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/1/22/022.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temerature temerature;

    @SerializedName("cond")
    public More more;

    public class Temerature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
