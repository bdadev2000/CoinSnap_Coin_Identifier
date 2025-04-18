package com.apm.insight.nativecrash;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.l.n;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private Map<String, String> a;

    public a(File file) {
        String a;
        File c10 = n.c(file);
        if (!c10.exists() || c10.length() == 0 || (a = NativeImpl.a(c10.getAbsolutePath())) == null) {
            return;
        }
        String[] split = a.split("\n");
        this.a = new HashMap();
        for (String str : split) {
            String[] split2 = str.split("=");
            if (split2.length == 2) {
                this.a.put(split2[0], split2[1]);
            }
        }
    }

    public boolean a() {
        Map<String, String> map = this.a;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.a.get("process_name")) || TextUtils.isEmpty(this.a.get("crash_thread_name")) || TextUtils.isEmpty(this.a.get("pid")) || TextUtils.isEmpty(this.a.get("tid")) || TextUtils.isEmpty(this.a.get("start_time")) || TextUtils.isEmpty(this.a.get("crash_time")) || TextUtils.isEmpty(this.a.get("signal_line"))) ? false : true;
    }

    @Nullable
    public String b() {
        return this.a.get("signal_line");
    }

    public Map<String, String> c() {
        return this.a;
    }
}
