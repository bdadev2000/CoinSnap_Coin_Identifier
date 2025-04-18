package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class r {
    private static File a;

    /* loaded from: classes.dex */
    public static class a {
        public String a;

        /* renamed from: b, reason: collision with root package name */
        public String f3349b;

        /* renamed from: c, reason: collision with root package name */
        public long f3350c;

        public a(String str) {
            String[] split = str.split("\\s+");
            if (split.length != 3) {
                com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str)));
                return;
            }
            this.a = split[0];
            this.f3349b = split[1];
            try {
                this.f3350c = Long.parseLong(split[2]);
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str), th2));
            }
        }
    }

    @Nullable
    private static File a() {
        if (a == null) {
            String c10 = com.apm.insight.l.a.c(com.apm.insight.i.g());
            if (c10 == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            a = new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) + '/' + c10.replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
        }
        return a;
    }

    public static File a(long j3) {
        return new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j3 - (j3 % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS));
    }

    @NonNull
    public static HashMap<String, a> a(long j3, String str) {
        File file = new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j3 - (j3 % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS));
        String[] list = file.list();
        HashMap<String, a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a10 = com.apm.insight.l.h.a(file2, length > 1048576 ? length - 524288 : 0L);
                    int length2 = a10.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String optString = a10.optString(length2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', AbstractJsonLexerKt.COLON).replace(".txt", ""), new a(optString));
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
            File a10 = a();
            if (a10 != null) {
                com.apm.insight.l.h.a(a10, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
