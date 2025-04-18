package com.bytedance.sdk.openadsdk.core.YoT.tN;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class tN {

    @NonNull
    private final Map<Sg, String> Sg;

    @NonNull
    private final List<String> YFl;

    public tN(@NonNull List<String> list) {
        this.YFl = list;
        HashMap hashMap = new HashMap();
        this.Sg = hashMap;
        hashMap.put(Sg.CACHEBUSTING, Sg());
    }

    @NonNull
    private String Sg() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    @NonNull
    public List<String> YFl() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.YFl) {
            if (!TextUtils.isEmpty(str)) {
                for (Sg sg2 : Sg.values()) {
                    String str2 = this.Sg.get(sg2);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str.replaceAll("\\[" + sg2.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NonNull
    private String Sg(long j3) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j3)), Long.valueOf(timeUnit.toMinutes(j3) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j3) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j3 % 1000));
    }

    @NonNull
    public tN YFl(@Nullable com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl yFl) {
        if (yFl != null) {
            this.Sg.put(Sg.ERRORCODE, yFl.YFl());
        }
        return this;
    }

    @NonNull
    public tN YFl(@Nullable long j3) {
        if (j3 >= 0) {
            String Sg = Sg(j3);
            if (!TextUtils.isEmpty(Sg)) {
                this.Sg.put(Sg.CONTENTPLAYHEAD, Sg);
            }
        }
        return this;
    }

    @NonNull
    public tN YFl(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.Sg.put(Sg.ASSETURI, str);
        }
        return this;
    }
}
