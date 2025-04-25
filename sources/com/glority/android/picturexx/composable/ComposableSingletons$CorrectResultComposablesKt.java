package com.glority.android.picturexx.composable;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.glority.android.picturexx.business.R;
import com.glority.base.composables.ComposableExtensionsKt;
import com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.IndexModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CorrectResultComposables.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CorrectResultComposablesKt {
    public static final ComposableSingletons$CorrectResultComposablesKt INSTANCE = new ComposableSingletons$CorrectResultComposablesKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f96lambda1 = ComposableLambdaKt.composableLambdaInstance(1044888448, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1044888448, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-1.<anonymous> (CorrectResultComposables.kt:117)");
                }
                ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.icon_close_x, composer, 0), "close button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f100lambda2 = ComposableLambdaKt.composableLambdaInstance(-158013034, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-158013034, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-2.<anonymous> (CorrectResultComposables.kt:172)");
                }
                TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.global_correctresult_searchbox_text, composer, 0), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131062);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f101lambda3 = ComposableLambdaKt.composableLambdaInstance(1413221749, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1413221749, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-3.<anonymous> (CorrectResultComposables.kt:165)");
                }
                ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.icon_correct_result_search, composer, 0), (String) null, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function6<LazyItemScope, Modifier, String, IndexModel, Composer, Integer, Unit> f102lambda4 = ComposableLambdaKt.composableLambdaInstance(-813775841, false, new Function6<LazyItemScope, Modifier, String, IndexModel, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Modifier modifier, String str, IndexModel indexModel, Composer composer, Integer num) {
            invoke(lazyItemScope, modifier, str, indexModel, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope CorrectResultScreen, Modifier modifier, String searchText, IndexModel item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(CorrectResultScreen, "$this$CorrectResultScreen");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            Intrinsics.checkNotNullParameter(item, "item");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-813775841, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-4.<anonymous> (CorrectResultComposables.kt:326)");
            }
            CorrectResultComposablesKt.CorrectResultItem(modifier, "common", CorrectResultComposablesKt.access$mock_IndenModel(), new Function1<IndexModel, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-4$1.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IndexModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IndexModel indexModel) {
                    invoke2(indexModel);
                    return Unit.INSTANCE;
                }
            }, composer, ((i >> 3) & 14) | 3632);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f103lambda5 = ComposableLambdaKt.composableLambdaInstance(-1822640466, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope CorrectResultScreen, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(CorrectResultScreen, "$this$CorrectResultScreen");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1822640466, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-5.<anonymous> (CorrectResultComposables.kt:338)");
            }
            TextKt.m3014Text4IGK_g("other", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f104lambda6 = ComposableLambdaKt.composableLambdaInstance(-1243874321, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope CorrectResultScreen, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(CorrectResultScreen, "$this$CorrectResultScreen");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1243874321, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-6.<anonymous> (CorrectResultComposables.kt:341)");
            }
            TextKt.m3014Text4IGK_g("empty", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f105lambda7 = ComposableLambdaKt.composableLambdaInstance(-387207773, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-387207773, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-7.<anonymous> (CorrectResultComposables.kt:322)");
                }
                CorrectResultComposablesKt.CorrectResultScreen(Modifier.INSTANCE, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-7$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, ComposableSingletons$CorrectResultComposablesKt.INSTANCE.m7772getLambda4$businessMod_release(), ComposableSingletons$CorrectResultComposablesKt.INSTANCE.m7773getLambda5$businessMod_release(), ComposableSingletons$CorrectResultComposablesKt.INSTANCE.m7774getLambda6$businessMod_release(), new AnonymousClass2(null), composer, 290230);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CorrectResultComposables.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 82)
        @DebugMetadata(c = "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-7$1$2", f = "CorrectResultComposables.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-7$1$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super List<? extends IndexModel>>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super List<? extends IndexModel>> continuation) {
                return invoke2(str, (Continuation<? super List<IndexModel>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(String str, Continuation<? super List<IndexModel>> continuation) {
                return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList(10);
                for (int i = 0; i < 10; i++) {
                    arrayList.add(CorrectResultComposablesKt.access$mock_IndenModel());
                }
                return arrayList;
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f106lambda8 = ComposableLambdaKt.composableLambdaInstance(599493336, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(599493336, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-8.<anonymous> (CorrectResultComposables.kt:393)");
                }
                ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.icon_close_x, composer, 0), "close button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f107lambda9 = ComposableLambdaKt.composableLambdaInstance(-2055570228, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2055570228, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-9.<anonymous> (CorrectResultComposables.kt:438)");
            }
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.global_correctresult_suggestnameoption_text, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f97lambda10 = ComposableLambdaKt.composableLambdaInstance(1503078837, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-10$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1503078837, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-10.<anonymous> (CorrectResultComposables.kt:479)");
            }
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.global_correctresult_suggestnameoption_text, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-11, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f98lambda11 = ComposableLambdaKt.composableLambdaInstance(1178990709, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-11$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1178990709, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-11.<anonymous> (CorrectResultComposables.kt:525)");
                }
                TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.text_send, composer, 0), (Modifier) null, Color.INSTANCE.m4552getWhite0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f99lambda12 = ComposableLambdaKt.composableLambdaInstance(346226316, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt$lambda-12$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(346226316, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CorrectResultComposablesKt.lambda-12.<anonymous> (CorrectResultComposables.kt:611)");
                }
                TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.result_base_text_suggest_name, composer, 0), (Modifier) null, Color.INSTANCE.m4552getWhite0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7766getLambda1$businessMod_release() {
        return f96lambda1;
    }

    /* renamed from: getLambda-10$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7767getLambda10$businessMod_release() {
        return f97lambda10;
    }

    /* renamed from: getLambda-11$businessMod_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7768getLambda11$businessMod_release() {
        return f98lambda11;
    }

    /* renamed from: getLambda-12$businessMod_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7769getLambda12$businessMod_release() {
        return f99lambda12;
    }

    /* renamed from: getLambda-2$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7770getLambda2$businessMod_release() {
        return f100lambda2;
    }

    /* renamed from: getLambda-3$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7771getLambda3$businessMod_release() {
        return f101lambda3;
    }

    /* renamed from: getLambda-4$businessMod_release, reason: not valid java name */
    public final Function6<LazyItemScope, Modifier, String, IndexModel, Composer, Integer, Unit> m7772getLambda4$businessMod_release() {
        return f102lambda4;
    }

    /* renamed from: getLambda-5$businessMod_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7773getLambda5$businessMod_release() {
        return f103lambda5;
    }

    /* renamed from: getLambda-6$businessMod_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7774getLambda6$businessMod_release() {
        return f104lambda6;
    }

    /* renamed from: getLambda-7$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7775getLambda7$businessMod_release() {
        return f105lambda7;
    }

    /* renamed from: getLambda-8$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7776getLambda8$businessMod_release() {
        return f106lambda8;
    }

    /* renamed from: getLambda-9$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7777getLambda9$businessMod_release() {
        return f107lambda9;
    }
}
