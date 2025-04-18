package androidx.print;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public final class PrintHelper {

    /* renamed from: androidx.print.PrintHelper$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends AsyncTask<Void, Void, Throwable> {
        @Override // android.os.AsyncTask
        public final Throwable doInBackground(Void[] voidArr) {
            try {
                throw null;
            } catch (Throwable th) {
                return th;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Throwable th) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public interface OnPrintFinishCallback {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public class PrintBitmapAdapter extends PrintDocumentAdapter {
        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public class PrintUriAdapter extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        public Bitmap f20798a;

        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
            super.onFinish();
            throw null;
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(final PrintAttributes printAttributes, final PrintAttributes printAttributes2, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f20798a != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                new AsyncTask<Uri, Boolean, Bitmap>() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1
                    @Override // android.os.AsyncTask
                    public final Bitmap doInBackground(Uri[] uriArr) {
                        try {
                            PrintUriAdapter.this.getClass();
                            throw null;
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }

                    @Override // android.os.AsyncTask
                    public final void onCancelled(Bitmap bitmap) {
                        layoutResultCallback.onLayoutCancelled();
                        PrintUriAdapter.this.getClass();
                    }

                    @Override // android.os.AsyncTask
                    public final void onPostExecute(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        super.onPostExecute(bitmap2);
                        if (bitmap2 != null) {
                            PrintUriAdapter.this.getClass();
                            throw null;
                        }
                        PrintUriAdapter.this.f20798a = bitmap2;
                        if (bitmap2 != null) {
                            PrintUriAdapter.this.getClass();
                            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
                        } else {
                            layoutResultCallback.onLayoutFailed(null);
                        }
                        PrintUriAdapter.this.getClass();
                    }

                    @Override // android.os.AsyncTask
                    public final void onPreExecute() {
                        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1.1
                            @Override // android.os.CancellationSignal.OnCancelListener
                            public final void onCancel() {
                                PrintUriAdapter.this.getClass();
                                throw null;
                            }
                        });
                    }
                }.execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }
    }
}
