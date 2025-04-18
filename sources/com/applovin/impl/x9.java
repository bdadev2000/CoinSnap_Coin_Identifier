package com.applovin.impl;

import com.applovin.impl.we;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x9 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f8960c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f8961b = -1;

    public boolean a() {
        return (this.a == -1 || this.f8961b == -1) ? false : true;
    }

    public boolean a(we weVar) {
        for (int i10 = 0; i10 < weVar.c(); i10++) {
            we.b a = weVar.a(i10);
            if (a instanceof s3) {
                s3 s3Var = (s3) a;
                if ("iTunSMPB".equals(s3Var.f7442c) && a(s3Var.f7443d)) {
                    return true;
                }
            } else if (a instanceof nb) {
                nb nbVar = (nb) a;
                if ("com.apple.iTunes".equals(nbVar.f6390b) && "iTunSMPB".equals(nbVar.f6391c) && a(nbVar.f6392d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean a(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.a = i11;
        this.f8961b = i12;
        return true;
    }

    private boolean a(String str) {
        Matcher matcher = f8960c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) yp.a((Object) matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) yp.a((Object) matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.f8961b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
