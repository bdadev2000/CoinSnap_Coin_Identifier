package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static File f6064a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f6065a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public long f6066c;

        public a(String str) {
            String[] split = str.split("\\s+");
            if (split.length != 3) {
                com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str)));
                return;
            }
            this.f6065a = split[0];
            this.b = split[1];
            try {
                this.f6066c = Long.parseLong(split[2]);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str), th));
            }
        }
    }

    @Nullable
    private static File a() {
        if (f6064a == null) {
            String c9 = com.apm.insight.l.a.c(com.apm.insight.i.g());
            if (c9 == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            f6064a = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) + '/' + c9.replace(':', '_') + ".txt");
        }
        return f6064a;
    }

    public static File a(long j7) {
        return new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j7 - (j7 % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS));
    }

    @NonNull
    public static HashMap<String, a> a(long j7, String str) {
        File file = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j7 - (j7 % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS));
        String[] list = file.list();
        HashMap<String, a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a6 = com.apm.insight.l.i.a(file2, length > 1048576 ? length - 524288 : 0L);
                    int length2 = a6.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String optString = a6.optString(length2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(".txt", ""), new a(optString));
                                break;
                            }
                            length2--;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    public static void a(String str, String str2) {
        try {
            File a6 = a();
            if (a6 != null) {
                com.apm.insight.l.i.a(a6, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
