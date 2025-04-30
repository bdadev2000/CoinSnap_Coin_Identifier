package com.applovin.impl;

import com.applovin.impl.we;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x9 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f12161c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f12162a = -1;
    public int b = -1;

    public boolean a() {
        return (this.f12162a == -1 || this.b == -1) ? false : true;
    }

    public boolean a(we weVar) {
        for (int i9 = 0; i9 < weVar.c(); i9++) {
            we.b a6 = weVar.a(i9);
            if (a6 instanceof s3) {
                s3 s3Var = (s3) a6;
                if ("iTunSMPB".equals(s3Var.f10566c) && a(s3Var.f10567d)) {
                    return true;
                }
            } else if (a6 instanceof nb) {
                nb nbVar = (nb) a6;
                if ("com.apple.iTunes".equals(nbVar.b) && "iTunSMPB".equals(nbVar.f9326c) && a(nbVar.f9327d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean a(int i9) {
        int i10 = i9 >> 12;
        int i11 = i9 & 4095;
        if (i10 <= 0 && i11 <= 0) {
            return false;
        }
        this.f12162a = i10;
        this.b = i11;
        return true;
    }

    private boolean a(String str) {
        Matcher matcher = f12161c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) yp.a((Object) matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) yp.a((Object) matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f12162a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
