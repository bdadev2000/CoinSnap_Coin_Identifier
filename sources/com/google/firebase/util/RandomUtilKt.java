package com.google.firebase.util;

import android.support.v4.media.d;
import e0.q;
import e0.u;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p0.a;
import u0.f;
import w0.g;

/* loaded from: classes.dex */
public final class RandomUtilKt {

    @NotNull
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    @NotNull
    public static final String nextAlphanumericString(@NotNull f fVar, int i2) {
        a.s(fVar, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("invalid length: ", i2).toString());
        }
        g F0 = a.F0(0, i2);
        ArrayList arrayList = new ArrayList(q.M(F0, 10));
        w0.f it = F0.iterator();
        while (it.f31411c) {
            it.b();
            if (ALPHANUMERIC_ALPHABET.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            arrayList.add(Character.valueOf(ALPHANUMERIC_ALPHABET.charAt(fVar.c(ALPHANUMERIC_ALPHABET.length()))));
        }
        return u.K0(arrayList, "", null, null, null, 62);
    }
}
