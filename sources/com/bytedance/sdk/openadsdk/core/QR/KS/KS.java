package com.bytedance.sdk.openadsdk.core.QR.KS;

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
public class KS {

    @NonNull
    private final Map<lMd, String> lMd;

    @NonNull
    private final List<String> zp;

    public KS(@NonNull List<String> list) {
        this.zp = list;
        HashMap hashMap = new HashMap();
        this.lMd = hashMap;
        hashMap.put(lMd.CACHEBUSTING, lMd());
    }

    @NonNull
    private String lMd() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    @NonNull
    public List<String> zp() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zp) {
            if (!TextUtils.isEmpty(str)) {
                for (lMd lmd : lMd.values()) {
                    String str2 = this.lMd.get(lmd);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str.replaceAll("\\[" + lmd.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NonNull
    private String lMd(long j7) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j7)), Long.valueOf(timeUnit.toMinutes(j7) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j7) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j7 % 1000));
    }

    @NonNull
    public KS zp(@Nullable com.bytedance.sdk.openadsdk.core.QR.zp.zp zpVar) {
        if (zpVar != null) {
            this.lMd.put(lMd.ERRORCODE, zpVar.zp());
        }
        return this;
    }

    @NonNull
    public KS zp(@Nullable long j7) {
        if (j7 >= 0) {
            String lMd = lMd(j7);
            if (!TextUtils.isEmpty(lMd)) {
                this.lMd.put(lMd.CONTENTPLAYHEAD, lMd);
            }
        }
        return this;
    }

    @NonNull
    public KS zp(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.lMd.put(lMd.ASSETURI, str);
        }
        return this;
    }
}
