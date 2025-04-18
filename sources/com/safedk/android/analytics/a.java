package com.safedk.android.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29141a = "ANRDetector";

    /* renamed from: b, reason: collision with root package name */
    private static final int f29142b = 5000;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f29143c = new HashSet(Arrays.asList("com.android.internal.os.RuntimeInit$UncaughtHandler.uncaughtException", "com.android.internal.os.RuntimeInit$KillApplicationHandler.uncaughtException"));
    private volatile int d;
    private Context e;

    /* renamed from: f, reason: collision with root package name */
    private int f29144f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f29145g;

    /* renamed from: h, reason: collision with root package name */
    private com.safedk.android.analytics.reporters.a f29146h;

    /* renamed from: i, reason: collision with root package name */
    private String f29147i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29148j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f29149k;

    public a(Context context) {
        this(context, 5000, false);
    }

    public a(Context context, boolean z2) {
        this(context, 5000, z2);
    }

    public a(Context context, int i2, boolean z2) {
        this.d = 0;
        this.f29149k = new Runnable() { // from class: com.safedk.android.analytics.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.d = (a.this.d + 1) % Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
        };
        this.e = context;
        this.f29144f = i2;
        this.f29148j = z2;
        this.f29145g = new Handler(Looper.getMainLooper());
        this.f29146h = new com.safedk.android.analytics.reporters.a(context);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
    }

    private StackTraceElement[] a() {
        return Looper.getMainLooper().getThread().getStackTrace();
    }

    private static String a(StackTraceElement[] stackTraceElementArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                messageDigest.update(stackTraceElement.toString().getBytes());
            }
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
