package androidx.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class NavHostControllerKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.navigation.NavHostController, androidx.navigation.NavController] */
    public static final NavHostController a(Context context) {
        p0.a.s(context, "context");
        ?? navController = new NavController(context);
        NavigatorProvider navigatorProvider = navController.w;
        navigatorProvider.a(new NavGraphNavigator(navigatorProvider));
        navController.w.a(new ComposeNavigator());
        navController.w.a(new DialogNavigator());
        return navController;
    }

    public static final NavHostController b(Navigator[] navigatorArr, Composer composer) {
        Context context = (Context) composer.K(AndroidCompositionLocals_androidKt.f16325b);
        Object[] copyOf = Arrays.copyOf(navigatorArr, navigatorArr.length);
        NavHostControllerKt$NavControllerSaver$1 navHostControllerKt$NavControllerSaver$1 = NavHostControllerKt$NavControllerSaver$1.f20584a;
        NavHostControllerKt$NavControllerSaver$2 navHostControllerKt$NavControllerSaver$2 = new NavHostControllerKt$NavControllerSaver$2(context);
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
        SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(navHostControllerKt$NavControllerSaver$2, navHostControllerKt$NavControllerSaver$1);
        boolean w = composer.w(context);
        Object u2 = composer.u();
        if (w || u2 == Composer.Companion.f13690a) {
            u2 = new NavHostControllerKt$rememberNavController$1$1(context);
            composer.o(u2);
        }
        NavHostController navHostController = (NavHostController) RememberSaveableKt.c(copyOf, saverKt$Saver$12, null, (q0.a) u2, composer, 0, 4);
        for (Navigator navigator : navigatorArr) {
            navHostController.w.a(navigator);
        }
        return navHostController;
    }
}
