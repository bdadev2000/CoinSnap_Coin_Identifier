package com.google.android.gms.tflite;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import org.tensorflow.lite.DataType;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
final class zzb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(DataType dataType) {
        switch (zza.zza[dataType.ordinal()]) {
            case 1:
                return TypedValues.Custom.S_FLOAT;
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return Constants.LONG;
            case 7:
                return "bool";
            case 8:
                return TypedValues.Custom.S_STRING;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + String.valueOf(dataType) + " is not supported yet");
        }
    }
}
