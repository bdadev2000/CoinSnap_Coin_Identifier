package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.RequestBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Preload.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a\u00ad\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00040\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012L\u0010\r\u001aH\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000ej\b\u0012\u0004\u0012\u0002H\u0004`\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u009f\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00192\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012L\u0010\r\u001aH\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000ej\b\u0012\u0004\u0012\u0002H\u0004`\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u00020\u001d*\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000*\u0088\u0001\u0010 \u001a\u0004\b\u0000\u0010!\">\u0012\u0013\u0012\u0011H!¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e2>\u0012\u0013\u0012\u0011H!¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"DEFAULT_ITEMS_TO_PRELOAD", "", "rememberGlidePreloadingData", "Lcom/bumptech/glide/integration/compose/GlidePreloadingData;", "DataT", "", "dataSize", "dataGetter", "Lkotlin/Function1;", "preloadImageSize", "Landroidx/compose/ui/geometry/Size;", "numberOfItemsToPreload", "fixedVisibleItemCount", "requestBuilderTransform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "requestBuilder", "Lcom/bumptech/glide/integration/compose/PreloadRequestBuilderTransform;", "rememberGlidePreloadingData-u6VnWhU", "(ILkotlin/jvm/functions/Function1;JILjava/lang/Integer;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)Lcom/bumptech/glide/integration/compose/GlidePreloadingData;", "data", "", "rememberGlidePreloadingData-Z8o_i8w", "(Ljava/util/List;JILjava/lang/Integer;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)Lcom/bumptech/glide/integration/compose/GlidePreloadingData;", "toIntArray", "", "toIntArray-uvyYCjk", "(J)[I", "PreloadRequestBuilderTransform", "DataTypeT", "compose_release"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PreloadKt {
    private static final int DEFAULT_ITEMS_TO_PRELOAD = 10;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 ??, still in use, count: 1, list:
          (r1v7 ?? I:java.lang.Object) from 0x00e7: INVOKE (r22v0 ?? I:androidx.compose.runtime.Composer), (r1v7 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:266)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    /* renamed from: rememberGlidePreloadingData-u6VnWhU, reason: not valid java name */
    public static final <DataT> com.bumptech.glide.integration.compose.GlidePreloadingData<DataT> m7678rememberGlidePreloadingDatau6VnWhU(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 ??, still in use, count: 1, list:
          (r1v7 ?? I:java.lang.Object) from 0x00e7: INVOKE (r22v0 ?? I:androidx.compose.runtime.Composer), (r1v7 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:266)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* renamed from: rememberGlidePreloadingData-Z8o_i8w, reason: not valid java name */
    public static final <DataT> GlidePreloadingData<DataT> m7677rememberGlidePreloadingDataZ8o_i8w(List<? extends DataT> data, long j, int i, Integer num, Function2<? super DataT, ? super RequestBuilder<Drawable>, ? extends RequestBuilder<Drawable>> requestBuilderTransform, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(requestBuilderTransform, "requestBuilderTransform");
        composer.startReplaceableGroup(-510325645);
        ComposerKt.sourceInformation(composer, "C(rememberGlidePreloadingData)P(!1,3:c#ui.geometry.Size,2)");
        int i4 = i2 << 3;
        GlidePreloadingData<DataT> m7678rememberGlidePreloadingDatau6VnWhU = m7678rememberGlidePreloadingDatau6VnWhU(data.size(), new PreloadKt$rememberGlidePreloadingData$2(data), j, (i3 & 4) != 0 ? 10 : i, (i3 & 8) != 0 ? null : num, requestBuilderTransform, composer, (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
        composer.endReplaceableGroup();
        return m7678rememberGlidePreloadingDatau6VnWhU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toIntArray-uvyYCjk, reason: not valid java name */
    public static final int[] m7679toIntArrayuvyYCjk(long j) {
        return new int[]{(int) Size.m4343getWidthimpl(j), (int) Size.m4340getHeightimpl(j)};
    }
}
