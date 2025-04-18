package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.util.x;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class j {
    public static final j INSTANCE = new j();

    private j() {
    }

    public final void apply(x pathProvider, PrintWriter out) {
        BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(out, "out");
        File file = new File(pathProvider.getJsAssetDir(f0.INSTANCE.getMraidJsVersion()), "mraid.min.js");
        if (file.exists()) {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            out.println(TextStreamsKt.readText(bufferedReader));
        }
    }
}
