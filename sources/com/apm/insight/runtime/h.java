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

    /* renamed from: a, reason: collision with root package name */
    private Context f6038a;
    private HashMap<String, Long> b;

    /* renamed from: c, reason: collision with root package name */
    private int f6039c = 50;

    /* renamed from: d, reason: collision with root package name */
    private int f6040d = 100;

    public h(Context context) {
        this.b = null;
        this.f6038a = context;
        this.b = c();
        b();
    }

    private void b() {
        this.f6039c = a.a(this.f6039c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f6040d = a.a(this.f6040d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> c() {
        JSONArray b;
        File h6 = com.apm.insight.l.o.h(this.f6038a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            b = com.apm.insight.l.i.b(h6.getAbsolutePath());
        } catch (IOException unused) {
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        if (com.apm.insight.l.l.a(b)) {
            return hashMap;
        }
        Long decode = Long.decode(b.optString(0, null));
        if (System.currentTimeMillis() - decode.longValue() > com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) {
            a(h6);
            return hashMap;
        }
        hashMap.put("time", decode);
        for (int i9 = 1; i9 < b.length(); i9++) {
            String[] split = b.optString(i9, "").split(" ");
            if (split.length == 2) {
                hashMap.put(split[0], Long.decode(split[1]));
            }
        }
        return hashMap;
    }

    public void a() {
        HashMap<String, Long> hashMap = this.b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(remove);
        sb.append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append(' ');
            sb.append(entry.getValue());
            sb.append('\n');
        }
        try {
            com.apm.insight.l.i.a(com.apm.insight.l.o.h(this.f6038a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    private void a(File file) {
        File g9 = com.apm.insight.l.o.g(this.f6038a);
        file.renameTo(new File(g9, String.valueOf(System.currentTimeMillis())));
        String[] list = g9.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g9, list[0]).delete();
        }
    }

    public boolean a(String str) {
        if (str == null) {
            str = "default";
        }
        return com.apm.insight.l.r.a(this.b, str, 1L).longValue() < ((long) this.f6039c) && com.apm.insight.l.r.a(this.b, "all", 1L).longValue() < ((long) this.f6040d);
    }
}
