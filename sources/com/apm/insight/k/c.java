package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f5874a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5875a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f5875a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5875a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5875a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f5876a;
        private JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        private CrashType f5877c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f5877c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f5876a = ((JSONArray) jSONObject.opt(DataSchemeDataSource.SCHEME_DATA)).optJSONObject(0);
            } else {
                this.f5876a = jSONObject;
            }
            this.b = jSONObject.optJSONObject("header");
        }

        @Nullable
        public String a() {
            return this.f5876a.optString("crash_thread_name", null);
        }

        public long b() {
            return this.f5876a.optInt("app_start_time", -1);
        }

        @Nullable
        public String c() {
            int i9 = AnonymousClass1.f5875a[this.f5877c.ordinal()];
            if (i9 == 1) {
                return this.f5876a.optString(DataSchemeDataSource.SCHEME_DATA, null);
            }
            if (i9 == 2) {
                return this.f5876a.optString("stack", null);
            }
            if (i9 != 3) {
                return null;
            }
            return this.f5876a.optString(DataSchemeDataSource.SCHEME_DATA, null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f5874a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a aVar = new a(jSONObject, crashType);
        while (!f5874a.isEmpty()) {
            c poll = f5874a.poll();
            if (poll != null) {
                poll.a(crashType, aVar);
            }
        }
        f5874a = null;
    }

    public abstract void a(CrashType crashType, a aVar);
}
