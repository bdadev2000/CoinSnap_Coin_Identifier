package com.apm.insight.runtime;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class h {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f3329b;

    /* renamed from: c, reason: collision with root package name */
    private int f3330c = 50;

    /* renamed from: d, reason: collision with root package name */
    private int f3331d = 100;

    public h(Context context) {
        this.f3329b = null;
        this.a = context;
        this.f3329b = c();
        b();
    }

    private void b() {
        this.f3330c = a.a(this.f3330c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f3331d = a.a(this.f3331d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> c() {
        JSONArray b3;
        File h10 = com.apm.insight.l.n.h(this.a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            b3 = com.apm.insight.l.h.b(h10.getAbsolutePath());
        } catch (IOException unused) {
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
        if (com.apm.insight.l.k.a(b3)) {
            return hashMap;
        }
        Long decode = Long.decode(b3.optString(0, null));
        if (System.currentTimeMillis() - decode.longValue() > com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) {
            a(h10);
            return hashMap;
        }
        hashMap.put("time", decode);
        for (int i10 = 1; i10 < b3.length(); i10++) {
            String[] split = b3.optString(i10, "").split(" ");
            if (split.length == 2) {
                hashMap.put(split[0], Long.decode(split[1]));
            }
        }
        return hashMap;
    }

    public void a() {
        HashMap<String, Long> hashMap = this.f3329b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(remove);
        sb2.append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(' ');
            sb2.append(entry.getValue());
            sb2.append('\n');
        }
        try {
            com.apm.insight.l.h.a(com.apm.insight.l.n.h(this.a), sb2.toString(), false);
        } catch (IOException unused) {
        }
    }

    private void a(File file) {
        File g10 = com.apm.insight.l.n.g(this.a);
        file.renameTo(new File(g10, String.valueOf(System.currentTimeMillis())));
        String[] list = g10.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g10, list[0]).delete();
        }
    }

    public boolean a(String str) {
        if (str == null) {
            str = "default";
        }
        return com.apm.insight.l.q.a(this.f3329b, str, 1L).longValue() < ((long) this.f3330c) && com.apm.insight.l.q.a(this.f3329b, "all", 1L).longValue() < ((long) this.f3331d);
    }
}
