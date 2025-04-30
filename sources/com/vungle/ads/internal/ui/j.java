package com.vungle.ads.internal.ui;

import androidx.fragment.app.FragmentTransaction;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.util.x;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class j {
    public static final j INSTANCE = new j();

    private j() {
    }

    public final void apply(x xVar, PrintWriter printWriter) {
        G7.j.e(xVar, "pathProvider");
        G7.j.e(printWriter, "out");
        File file = new File(xVar.getJsAssetDir(F.INSTANCE.getMraidJsVersion()), "mraid.min.js");
        if (file.exists()) {
            printWriter.println(com.bumptech.glide.d.T(new BufferedReader(new InputStreamReader(new FileInputStream(file), O7.a.f2244a), FragmentTransaction.TRANSIT_EXIT_MASK)));
        }
    }
}
