package com.glority.mediaplayer.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/glority/mediaplayer/utils/Utils;", "", "()V", "formatTime", "", "timeInSeconds", "", "readHTMLFromUTF8File", "inputStream", "Ljava/io/InputStream;", "base_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public final String readHTMLFromUTF8File(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                StringBuilder sb = new StringBuilder();
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    sb.append(readLine).append("\n");
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
                return sb2;
            } catch (Exception unused) {
                throw new RuntimeException("Can't parse HTML file.");
            }
        } finally {
            inputStream.close();
        }
    }

    @JvmStatic
    public static final String formatTime(float timeInSeconds) {
        float f = 60;
        int i = (int) (timeInSeconds / f);
        int i2 = (int) (timeInSeconds % f);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
