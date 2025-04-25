package com.glority.android.picturexx.utils;

import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.glority.utils.app.ResUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetsUtils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/utils/AssetsUtils;", "", "<init>", "()V", "getUids", "", "", TransferTable.COLUMN_FILE, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class AssetsUtils {
    public static final int $stable = 0;
    public static final AssetsUtils INSTANCE = new AssetsUtils();

    private AssetsUtils() {
    }

    public final List<String> getUids(String file) {
        Intrinsics.checkNotNullParameter(file, "file");
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ResUtils.getAssets().open(file)));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            if (readLine != null && !TextUtils.isEmpty(readLine)) {
                arrayList.add(readLine);
            }
        }
    }
}
