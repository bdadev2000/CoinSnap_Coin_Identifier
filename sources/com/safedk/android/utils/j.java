package com.safedk.android.utils;

import android.widget.Toast;
import com.safedk.android.SafeDK;

/* loaded from: classes4.dex */
public class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    String f30091a;

    /* renamed from: b, reason: collision with root package name */
    String f30092b;

    public j(String str) {
        this(str, null);
    }

    public j(String str, String str2) {
        this.f30091a = str;
        this.f30092b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast.makeText(SafeDK.getInstance().l(), "SDK '" + this.f30091a + "' " + (this.f30092b == null ? "" : "Toggle '" + this.f30092b + "'") + " blocked by SafeDK", 0).show();
    }
}
