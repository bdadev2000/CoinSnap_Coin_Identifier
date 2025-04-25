package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: NavHost.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aó\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0018\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u001f\b\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0019\u001a»\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u001d\b\u0002\u0010\u001e\u001a\u0017\u0012\u0004\u0012\u00020 \u0012\r\u0012\u000b\u0012\u0002\b\u00030!¢\u0006\u0002\b\u00100\u001f2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010$\u001a\u0098\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010&\u001aÚ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2\u001f\b\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010'\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010(\u001a¿\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u001d\b\u0002\u0010\u001e\u001a\u0017\u0012\u0004\u0012\u00020 \u0012\r\u0012\u000b\u0012\u0002\b\u00030!¢\u0006\u0002\b\u00100\u001f2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010)\u001a\u001c\u0010*\u001a\u0004\u0018\u00010\u000f*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010-\u001a\u0004\u0018\u00010\u0013*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010.\u001a\u0004\u0018\u00010\u000f*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010/\u001a\u0004\u0018\u00010\u0013*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u00100\u001a\u0004\u0018\u00010\u0017*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u00061²\u0006\u0010\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002²\u0006\u0010\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002"}, d2 = {"NavHost", "", "navController", "Landroidx/navigation/NavHostController;", "graph", "Landroidx/navigation/NavGraph;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "contentAlignment", "Landroidx/compose/ui/Alignment;", "enterTransition", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "exitTransition", "Landroidx/compose/animation/ExitTransition;", "popEnterTransition", "popExitTransition", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "startDestination", "", "route", "Lkotlin/reflect/KClass;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "builder", "Landroidx/navigation/NavGraphBuilder;", "(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Lkotlin/reflect/KClass;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "createEnterTransition", "Landroidx/navigation/NavDestination;", "scope", "createExitTransition", "createPopEnterTransition", "createPopExitTransition", "createSizeTransform", "navigation-compose_release", "currentBackStack", "", "progress", "", "inPredictiveBack", "", "allVisibleEntries", "visibleEntries"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class NavHostKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006a  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, java.lang.String r23, final kotlin.jvm.functions.Function1 r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019b  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r26, final java.lang.String r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.Alignment r29, java.lang.String r30, kotlin.jvm.functions.Function1 r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function1 r34, final kotlin.jvm.functions.Function1 r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavHost(final androidx.navigation.NavHostController r27, final java.lang.String r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.Alignment r30, java.lang.String r31, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r32, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r33, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r34, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r35, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r36, final kotlin.jvm.functions.Function1<? super androidx.navigation.NavGraphBuilder, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavHost(final androidx.navigation.NavHostController r30, final kotlin.reflect.KClass<?> r31, androidx.compose.ui.Modifier r32, androidx.compose.ui.Alignment r33, kotlin.reflect.KClass<?> r34, java.util.Map<kotlin.reflect.KType, androidx.navigation.NavType<?>> r35, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r36, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r37, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r38, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r39, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r40, final kotlin.jvm.functions.Function1<? super androidx.navigation.NavGraphBuilder, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, kotlin.reflect.KClass, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, kotlin.reflect.KClass, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavHost(final androidx.navigation.NavHostController r30, final java.lang.Object r31, androidx.compose.ui.Modifier r32, androidx.compose.ui.Alignment r33, kotlin.reflect.KClass<?> r34, java.util.Map<kotlin.reflect.KType, androidx.navigation.NavType<?>> r35, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r36, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r37, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r38, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r39, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r40, final kotlin.jvm.functions.Function1<? super androidx.navigation.NavGraphBuilder, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, kotlin.reflect.KClass, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r18, final androidx.navigation.NavGraph r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r23, final androidx.navigation.NavGraph r24, androidx.compose.ui.Modifier r25, androidx.compose.ui.Alignment r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function1 r29, kotlin.jvm.functions.Function1 r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavHost(final androidx.navigation.NavHostController r34, final androidx.navigation.NavGraph r35, androidx.compose.ui.Modifier r36, androidx.compose.ui.Alignment r37, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r38, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r39, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r40, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r41, kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavHost$lambda$8(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NavHost$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavHost$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 != null) {
                return enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 != null) {
                return exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 != null) {
                return popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 != null) {
                return popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SizeTransform createSizeTransform(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getSizeTransform$navigation_compose_release();
            if (sizeTransform$navigation_compose_release2 != null) {
                return sizeTransform$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (sizeTransform$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getSizeTransform$navigation_compose_release()) == null) {
            return null;
        }
        return sizeTransform$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$6(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$15(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$17(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }
}
