package com.apm.insight.nativecrash;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.l.o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f5947a;

    public a(File file) {
        String a6;
        File c9 = o.c(file);
        if (!c9.exists() || c9.length() == 0 || (a6 = NativeImpl.a(c9.getAbsolutePath())) == null) {
            return;
        }
        String[] split = a6.split("\n");
        this.f5947a = new HashMap();
        for (String str : split) {
            String[] split2 = str.split("=");
            if (split2.length == 2) {
                this.f5947a.put(split2[0], split2[1]);
            }
        }
    }

    public boolean a() {
        Map<String, String> map = this.f5947a;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f5947a.get("process_name")) || TextUtils.isEmpty(this.f5947a.get("crash_thread_name")) || TextUtils.isEmpty(this.f5947a.get("pid")) || TextUtils.isEmpty(this.f5947a.get("tid")) || TextUtils.isEmpty(this.f5947a.get("start_time")) || TextUtils.isEmpty(this.f5947a.get("crash_time")) || TextUtils.isEmpty(this.f5947a.get("signal_line"))) ? false : true;
    }

    @Nullable
    public String b() {
        return this.f5947a.get("signal_line");
    }

    public Map<String, String> c() {
        return this.f5947a;
    }
}
