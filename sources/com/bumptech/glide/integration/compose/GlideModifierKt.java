package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.integration.compose.Transition;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* compiled from: GlideModifier.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u007f\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0001¢\u0006\u0002\u0010)\"\"\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\"?\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002*\u00020\u000e2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006*"}, d2 = {"DisplayedDrawableKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroid/graphics/drawable/Drawable;", "getDisplayedDrawableKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "MAIN_HANDLER", "Landroid/os/Handler;", "getMAIN_HANDLER", "()Landroid/os/Handler;", "MAIN_HANDLER$delegate", "Lkotlin/Lazy;", "<set-?>", "displayedDrawable", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getDisplayedDrawable", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/jvm/functions/Function0;", "setDisplayedDrawable", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function0;)V", "displayedDrawable$delegate", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "glideNode", "Landroidx/compose/ui/Modifier;", "requestBuilder", "Lcom/bumptech/glide/RequestBuilder;", "contentDescription", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "transitionFactory", "Lcom/bumptech/glide/integration/compose/Transition$Factory;", "requestListener", "Lcom/bumptech/glide/integration/compose/RequestListener;", "draw", "", "(Landroidx/compose/ui/Modifier;Lcom/bumptech/glide/RequestBuilder;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Ljava/lang/Float;Landroidx/compose/ui/graphics/ColorFilter;Lcom/bumptech/glide/integration/compose/Transition$Factory;Lcom/bumptech/glide/integration/compose/RequestListener;Ljava/lang/Boolean;)Landroidx/compose/ui/Modifier;", "compose_release"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GlideModifierKt {
    private static final SemanticsPropertyKey<Function0<Drawable>> DisplayedDrawableKey;
    private static final SemanticsPropertyKey displayedDrawable$delegate;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(GlideModifierKt.class, "displayedDrawable", "getDisplayedDrawable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/jvm/functions/Function0;", 1))};
    private static final Lazy MAIN_HANDLER$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Handler>() { // from class: com.bumptech.glide.integration.compose.GlideModifierKt$MAIN_HANDLER$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    public static final Modifier glideNode(Modifier modifier, RequestBuilder<Drawable> requestBuilder, final String str, Alignment alignment, ContentScale contentScale, Float f, ColorFilter colorFilter, Transition.Factory factory, RequestListener requestListener, Boolean bool) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        return modifier.then(SemanticsModifierKt.semantics$default(ClipKt.clipToBounds(new GlideNodeElement(requestBuilder, contentScale == null ? ContentScale.INSTANCE.getNone() : contentScale, alignment == null ? Alignment.INSTANCE.getCenter() : alignment, f, colorFilter, requestListener, bool, factory)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideModifierKt$glideNode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                String str2 = str;
                if (str2 != null) {
                    SemanticsPropertiesKt.setContentDescription(semantics, str2);
                }
                SemanticsPropertiesKt.m6289setRolekuIjeqM(semantics, Role.INSTANCE.m6273getImageo7Vup1c());
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler getMAIN_HANDLER() {
        return (Handler) MAIN_HANDLER$delegate.getValue();
    }

    public static final SemanticsPropertyKey<Function0<Drawable>> getDisplayedDrawableKey() {
        return DisplayedDrawableKey;
    }

    static {
        SemanticsPropertyKey<Function0<Drawable>> semanticsPropertyKey = new SemanticsPropertyKey<>("DisplayedDrawable", null, 2, null);
        DisplayedDrawableKey = semanticsPropertyKey;
        displayedDrawable$delegate = semanticsPropertyKey;
    }

    public static final Function0<Drawable> getDisplayedDrawable(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return (Function0) displayedDrawable$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final void setDisplayedDrawable(SemanticsPropertyReceiver semanticsPropertyReceiver, Function0<? extends Drawable> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        displayedDrawable$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], function0);
    }
}
