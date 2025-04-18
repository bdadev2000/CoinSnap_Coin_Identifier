package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes2.dex */
final class TypefaceBuilderCompat {
    public static FontVariationAxis[] d(FontVariation.Settings settings, Context context) {
        Density a2;
        if (context != null) {
            a2 = AndroidDensity_androidKt.a(context);
        } else {
            if (settings.f17263b) {
                throw new IllegalStateException("Required density, but not provided");
            }
            a2 = DensityKt.a(1.0f, 1.0f);
        }
        ArrayList arrayList = settings.f17262a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FontVariation.Setting setting = (FontVariation.Setting) arrayList.get(i2);
            setting.c();
            arrayList2.add(new FontVariationAxis(null, setting.b(a2)));
        }
        return (FontVariationAxis[]) arrayList2.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface a(@NotNull AssetManager assetManager, @NotNull String str, @Nullable Context context, @NotNull FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, str).setFontVariationSettings(d(settings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface b(@NotNull File file, @Nullable Context context, @NotNull FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(file).setFontVariationSettings(d(settings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface c(@NotNull ParcelFileDescriptor parcelFileDescriptor, @Nullable Context context, @NotNull FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(d(settings, context)).build();
    }
}
