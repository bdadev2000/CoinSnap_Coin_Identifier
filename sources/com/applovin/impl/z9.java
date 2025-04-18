package com.applovin.impl;

import com.applovin.impl.bf;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class z9 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f28315c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f28316a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f28317b = -1;

    public boolean a() {
        return (this.f28316a == -1 || this.f28317b == -1) ? false : true;
    }

    public boolean a(int i2) {
        int i3 = i2 >> 12;
        int i4 = i2 & 4095;
        if (i3 <= 0 && i4 <= 0) {
            return false;
        }
        this.f28316a = i3;
        this.f28317b = i4;
        return true;
    }

    public boolean a(bf bfVar) {
        for (int i2 = 0; i2 < bfVar.c(); i2++) {
            bf.b a2 = bfVar.a(i2);
            if (a2 instanceof u3) {
                u3 u3Var = (u3) a2;
                if ("iTunSMPB".equals(u3Var.f27272c) && a(u3Var.d)) {
                    return true;
                }
            } else if (a2 instanceof sb) {
                sb sbVar = (sb) a2;
                if ("com.apple.iTunes".equals(sbVar.f26476b) && "iTunSMPB".equals(sbVar.f26477c) && a(sbVar.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = f28315c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) xp.a((Object) matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) xp.a((Object) matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f28316a = parseInt;
            this.f28317b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
