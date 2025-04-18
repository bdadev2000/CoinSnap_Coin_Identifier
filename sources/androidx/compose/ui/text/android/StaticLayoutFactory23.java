package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes4.dex */
public final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @NotNull
    public StaticLayout a(@NotNull StaticLayoutParams staticLayoutParams) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(staticLayoutParams.f17091a, staticLayoutParams.f17092b, staticLayoutParams.f17093c, staticLayoutParams.d, staticLayoutParams.e);
        obtain.setTextDirection(staticLayoutParams.f17094f);
        obtain.setAlignment(staticLayoutParams.f17095g);
        obtain.setMaxLines(staticLayoutParams.f17096h);
        obtain.setEllipsize(staticLayoutParams.f17097i);
        obtain.setEllipsizedWidth(staticLayoutParams.f17098j);
        obtain.setLineSpacing(staticLayoutParams.f17100l, staticLayoutParams.f17099k);
        obtain.setIncludePad(staticLayoutParams.f17102n);
        obtain.setBreakStrategy(staticLayoutParams.f17104p);
        obtain.setHyphenationFrequency(staticLayoutParams.f17107s);
        obtain.setIndents(staticLayoutParams.f17108t, staticLayoutParams.f17109u);
        int i2 = Build.VERSION.SDK_INT;
        StaticLayoutFactory26.a(obtain, staticLayoutParams.f17101m);
        if (i2 >= 28) {
            StaticLayoutFactory28.a(obtain, staticLayoutParams.f17103o);
        }
        if (i2 >= 33) {
            StaticLayoutFactory33.b(obtain, staticLayoutParams.f17105q, staticLayoutParams.f17106r);
        }
        return obtain.build();
    }
}
