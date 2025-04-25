package com.glority.android.core.utils.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CompatObjectInputStream.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/glority/android/core/utils/data/CompatObjectInputStream;", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "resolveClass", "Ljava/lang/Class;", "desc", "Ljava/io/ObjectStreamClass;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class CompatObjectInputStream extends ObjectInputStream {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompatObjectInputStream(InputStream inputStream) {
        super(inputStream);
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
        Intrinsics.checkNotNullParameter(desc, "desc");
        String name = desc.getName();
        Intrinsics.checkNotNullExpressionValue(name, "desc.name");
        try {
            if (StringsKt.startsWith$default(name, "com.component.generatedAPI.kotlinAPI", false, 2, (Object) null)) {
                name = StringsKt.replace$default(name, "com.component.generatedAPI.kotlinAPI", "com.glority.component.generatedAPI.kotlinAPI", false, 4, (Object) null);
            } else if (StringsKt.startsWith$default(name, "com.xingse.app.kt", false, 2, (Object) null)) {
                name = StringsKt.replace$default(name, "com.xingse.app.kt", "com.glority.picturethis.app.kt", false, 4, (Object) null);
            }
            Class<?> cls = Class.forName(name);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(name)");
            return cls;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Class<?> resolveClass = super.resolveClass(desc);
            Intrinsics.checkNotNullExpressionValue(resolveClass, "super.resolveClass(desc)");
            return resolveClass;
        }
    }
}
