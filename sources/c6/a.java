package C6;

import F7.l;
import G7.j;
import I6.g;
import J1.r;
import Q7.AbstractC0255x;
import U4.C0314j;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.widget.Toast;
import androidx.lifecycle.V;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.bubble.BubbleActivity;
import com.tools.arruler.ui.component.imagedetail.ImageDetailActivity;
import com.tools.arruler.ui.component.language.LanguageActivity;
import com.tools.arruler.ui.component.permission.PermissionActivity;
import com.tools.arruler.ui.component.protractor.ProtractorActivity;
import com.tools.arruler.ui.component.protractor.view.ProtractorView;
import com.tools.arruler.utils.view.BubbleLevelView;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import t7.y;
import u6.AbstractC2787c;
import u6.Y;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f572c;

    public /* synthetic */ a(Object obj, int i9) {
        this.b = i9;
        this.f572c = obj;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        Task task;
        String f9;
        boolean z8 = false;
        z8 = false;
        switch (this.b) {
            case 0:
                int i9 = BubbleActivity.f19648f;
                BubbleActivity bubbleActivity = (BubbleActivity) this.f572c;
                j.e(bubbleActivity, "this$0");
                bubbleActivity.onBackPressed();
                return y.f23029a;
            case 1:
                int i10 = BubbleActivity.f19648f;
                AbstractC2787c abstractC2787c = (AbstractC2787c) this.f572c;
                j.e(abstractC2787c, "$this_apply");
                BubbleLevelView bubbleLevelView = abstractC2787c.f23268q;
                bubbleLevelView.l = bubbleLevelView.f19745j;
                bubbleLevelView.m = bubbleLevelView.f19746k;
                bubbleLevelView.invalidate();
                return y.f23029a;
            case 2:
                String str = (String) obj;
                int i11 = ImageDetailActivity.f19658k;
                ImageDetailActivity imageDetailActivity = (ImageDetailActivity) this.f572c;
                j.e(imageDetailActivity, "this$0");
                j.e(str, "it");
                String str2 = ((g) imageDetailActivity.u().f1479d.getValue()).f1476a;
                if (str2 != null) {
                    File file = new File(str2);
                    if (!D7.a.W(file).equals(str)) {
                        File parentFile = file.getParentFile();
                        String name = file.getName();
                        j.d(name, "getName(...)");
                        z8 = file.renameTo(new File(parentFile, o.k(str, ".", O7.g.Y(name, ""))));
                    }
                }
                if (z8) {
                    imageDetailActivity.setResult(-1);
                }
                return y.f23029a;
            case 3:
                J6.c cVar = (J6.c) this.f572c;
                j.e(cVar, "this$0");
                ((Y) cVar.a()).f23237q.requestFocus();
                return y.f23029a;
            case 4:
                M6.a aVar = (M6.a) obj;
                int i12 = LanguageActivity.m;
                LanguageActivity languageActivity = (LanguageActivity) this.f572c;
                j.e(languageActivity, "this$0");
                j.e(aVar, "it");
                L6.b bVar = languageActivity.f19668j;
                if (bVar != null) {
                    Iterator it = bVar.f24240i.iterator();
                    while (it.hasNext()) {
                        M6.a aVar2 = (M6.a) it.next();
                        aVar2.f2008d = j.a(aVar2.b, aVar.b);
                    }
                    bVar.notifyDataSetChanged();
                }
                languageActivity.f19669k = aVar;
                new Handler(Looper.getMainLooper()).postDelayed(new K6.a(languageActivity, false ? 1 : 0), 1000L);
                if (!languageActivity.l) {
                    languageActivity.l = true;
                    if (!languageActivity.getIntent().getBooleanExtra("KEY_SETTING", false)) {
                        AbstractC0255x.l(V.f(languageActivity), null, null, new K6.b(languageActivity, null), 3);
                    }
                }
                return y.f23029a;
            case 5:
                int i13 = PermissionActivity.f19681i;
                PermissionActivity permissionActivity = (PermissionActivity) this.f572c;
                j.e(permissionActivity, "this$0");
                permissionActivity.finish();
                return y.f23029a;
            case 6:
                int i14 = ProtractorActivity.f19685f;
                ProtractorActivity protractorActivity = (ProtractorActivity) this.f572c;
                j.e(protractorActivity, "this$0");
                protractorActivity.onBackPressed();
                return y.f23029a;
            case 7:
                float floatValue = ((Float) obj).floatValue();
                int i15 = ProtractorView.f19686s;
                ProtractorView protractorView = (ProtractorView) this.f572c;
                j.e(protractorView, "this$0");
                return Float.valueOf(TypedValue.applyDimension(1, floatValue, protractorView.getResources().getDisplayMetrics()));
            default:
                Activity activity = (Activity) this.f572c;
                int intValue = ((Integer) obj).intValue();
                j.e(activity, "$activity");
                if (intValue <= 3) {
                    a7.b bVar2 = a7.b.f4076f;
                    if (bVar2 != null) {
                        bVar2.A("IS_RATE", true);
                        Toast.makeText(activity, activity.getString(R.string.txt_thanks_you_for_rating), 0).show();
                    } else {
                        throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
                    }
                } else {
                    Context applicationContext = activity.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = activity;
                    }
                    E1.d dVar = new E1.d(new X3.g(applicationContext));
                    X3.g gVar = (X3.g) dVar.f973c;
                    r rVar = X3.g.f3673c;
                    rVar.a("requestInAppReview (%s)", gVar.b);
                    if (gVar.f3674a == null) {
                        Object[] objArr = new Object[0];
                        if (Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", r.b(rVar.f1539a, "Play Store app is either not installed or not the official version", objArr));
                        }
                        Locale locale = Locale.getDefault();
                        HashMap hashMap = Z3.a.f3879a;
                        if (!hashMap.containsKey(-1)) {
                            f9 = "";
                        } else {
                            f9 = AbstractC2914a.f((String) hashMap.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) Z3.a.b.get(-1), ")");
                        }
                        task = Tasks.forException(new ApiException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, f9))));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        Y3.j jVar = gVar.f3674a;
                        X3.e eVar = new X3.e(gVar, taskCompletionSource, taskCompletionSource, 0);
                        synchronized (jVar.f3781f) {
                            jVar.f3780e.add(taskCompletionSource);
                            taskCompletionSource.getTask().addOnCompleteListener(new E1.d(18, jVar, taskCompletionSource));
                        }
                        synchronized (jVar.f3781f) {
                            try {
                                if (jVar.f3786k.getAndIncrement() > 0) {
                                    r rVar2 = jVar.b;
                                    Object[] objArr2 = new Object[0];
                                    rVar2.getClass();
                                    if (Log.isLoggable("PlayCore", 3)) {
                                        Log.d("PlayCore", r.b(rVar2.f1539a, "Already connected to the service.", objArr2));
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        jVar.a().post(new X3.e(jVar, taskCompletionSource, eVar, 1));
                        task = taskCompletionSource.getTask();
                    }
                    j.d(task, "requestReviewFlow(...)");
                    task.addOnCompleteListener(new C0314j(dVar, activity));
                }
                return y.f23029a;
        }
    }
}
