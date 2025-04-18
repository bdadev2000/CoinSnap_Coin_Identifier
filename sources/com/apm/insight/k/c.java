package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {
    private static ConcurrentLinkedQueue<c> a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CrashType.values().length];
            a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        private JSONObject a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f3186b;

        /* renamed from: c, reason: collision with root package name */
        private CrashType f3187c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f3187c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.a = ((JSONArray) jSONObject.opt(DataSchemeDataSource.SCHEME_DATA)).optJSONObject(0);
            } else {
                this.a = jSONObject;
            }
            this.f3186b = jSONObject.optJSONObject("header");
        }

        @Nullable
        public String a() {
            return this.a.optString("crash_thread_name", null);
        }

        public long b() {
            return this.a.optInt("app_start_time", -1);
        }

        @Nullable
        public String c() {
            int i10 = AnonymousClass1.a[this.f3187c.ordinal()];
            if (i10 == 1) {
                return this.a.optString(DataSchemeDataSource.SCHEME_DATA, null);
            }
            if (i10 == 2) {
                return this.a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.a.optString(DataSchemeDataSource.SCHEME_DATA, null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a aVar = new a(jSONObject, crashType);
        while (!a.isEmpty()) {
            c poll = a.poll();
            if (poll != null) {
                poll.a(crashType, aVar);
            }
        }
        a = null;
    }

    public abstract void a(CrashType crashType, a aVar);
}
