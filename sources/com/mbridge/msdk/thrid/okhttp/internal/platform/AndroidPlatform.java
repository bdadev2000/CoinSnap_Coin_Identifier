package com.mbridge.msdk.thrid.okhttp.internal.platform;

import android.os.Build;
import android.util.Log;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.tls.CertificateChainCleaner;
import com.mbridge.msdk.thrid.okhttp.internal.tls.TrustRootIndex;
import com.vungle.ads.internal.presenter.q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class AndroidPlatform extends Platform {
    private static final int MAX_LOG_LENGTH = 4000;
    private final CloseGuard closeGuard = CloseGuard.get();
    private final OptionalMethod<Socket> getAlpnSelectedProtocol;
    private final OptionalMethod<Socket> setAlpnProtocols;
    private final OptionalMethod<Socket> setHostname;
    private final OptionalMethod<Socket> setUseSessionTickets;
    private final Class<?> sslParametersClass;

    /* loaded from: classes4.dex */
    public static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
        private final Method checkServerTrusted;
        private final Object x509TrustManagerExtensions;

        public AndroidCertificateChainCleaner(Object obj, Method method) {
            this.x509TrustManagerExtensions = obj;
            this.checkServerTrusted = method;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.CertificateChainCleaner
        public List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.checkServerTrusted.invoke(this.x509TrustManagerExtensions, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof AndroidCertificateChainCleaner;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* loaded from: classes4.dex */
    public static final class AndroidTrustRootIndex implements TrustRootIndex {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        public AndroidTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.findByIssuerAndSignatureMethod = method;
            this.trustManager = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AndroidTrustRootIndex)) {
                return false;
            }
            AndroidTrustRootIndex androidTrustRootIndex = (AndroidTrustRootIndex) obj;
            if (this.trustManager.equals(androidTrustRootIndex.trustManager) && this.findByIssuerAndSignatureMethod.equals(androidTrustRootIndex.findByIssuerAndSignatureMethod)) {
                return true;
            }
            return false;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.TrustRootIndex
        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.findByIssuerAndSignatureMethod.invoke(this.trustManager, x509Certificate);
                if (trustAnchor == null) {
                    return null;
                }
                return trustAnchor.getTrustedCert();
            } catch (IllegalAccessException e2) {
                throw Util.assertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return (this.findByIssuerAndSignatureMethod.hashCode() * 31) + this.trustManager.hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class CloseGuard {
        private final Method getMethod;
        private final Method openMethod;
        private final Method warnIfOpenMethod;

        public CloseGuard(Method method, Method method2, Method method3) {
            this.getMethod = method;
            this.openMethod = method2;
            this.warnIfOpenMethod = method3;
        }

        public static CloseGuard get() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod(q.OPEN, String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new CloseGuard(method, method3, method2);
        }

        public Object createAndOpen(String str) {
            Method method = this.getMethod;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.openMethod.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean warnIfOpen(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.warnIfOpenMethod.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public AndroidPlatform(Class<?> cls, OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4) {
        this.sslParametersClass = cls;
        this.setUseSessionTickets = optionalMethod;
        this.setHostname = optionalMethod2;
        this.getAlpnSelectedProtocol = optionalMethod3;
        this.setAlpnProtocols = optionalMethod4;
    }

    private boolean api23IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        }
    }

    private boolean api24IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return api23IsCleartextTrafficPermitted(str, cls, obj);
        }
    }

    public static Platform buildIfSupported() {
        Class<?> cls;
        OptionalMethod optionalMethod;
        OptionalMethod optionalMethod2;
        if (!Platform.isAndroid()) {
            return null;
        }
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            OptionalMethod optionalMethod3 = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
            OptionalMethod optionalMethod4 = new OptionalMethod(null, "setHostname", String.class);
            if (supportsAlpn()) {
                OptionalMethod optionalMethod5 = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                optionalMethod2 = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
                optionalMethod = optionalMethod5;
            } else {
                optionalMethod = null;
                optionalMethod2 = null;
            }
            return new AndroidPlatform(cls2, optionalMethod3, optionalMethod4, optionalMethod, optionalMethod2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static int getSdkInt() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    private static boolean supportsAlpn() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new AndroidCertificateChainCleaner(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new AndroidTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (str != null) {
            this.setUseSessionTickets.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
            this.setHostname.invokeOptionalWithoutCheckedException(sSLSocket, str);
        }
        OptionalMethod<Socket> optionalMethod = this.setAlpnProtocols;
        if (optionalMethod != null && optionalMethod.isSupported(sSLSocket)) {
            this.setAlpnProtocols.invokeWithoutCheckedException(sSLSocket, Platform.concatLengthPrefixed(list));
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e2) {
            if (Util.isAndroidGetsocknameError(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e10);
                throw iOException;
            }
            throw e10;
        } catch (SecurityException e11) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e11);
            throw iOException2;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public SSLContext getSSLContext() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        byte[] bArr;
        OptionalMethod<Socket> optionalMethod = this.getAlpnSelectedProtocol;
        if (optionalMethod == null || !optionalMethod.isSupported(sSLSocket) || (bArr = (byte[]) this.getAlpnSelectedProtocol.invokeWithoutCheckedException(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, Util.UTF_8);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public Object getStackTraceForCloseable(String str) {
        return this.closeGuard.createAndOpen(str);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return api24IsCleartextTrafficPermitted(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw Util.assertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw Util.assertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw Util.assertionError("unable to determine cleartext support", e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public void log(int i10, String str, Throwable th2) {
        int min;
        int i11 = 5;
        if (i10 != 5) {
            i11 = 3;
        }
        if (th2 != null) {
            str = str + '\n' + Log.getStackTraceString(th2);
        }
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i12 = min;
                }
            }
            i12 = min + 1;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public void logCloseableLeak(String str, Object obj) {
        if (!this.closeGuard.warnIfOpen(obj)) {
            log(5, str, null);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object readFieldOrNull = Platform.readFieldOrNull(sSLSocketFactory, this.sslParametersClass, "sslParameters");
        if (readFieldOrNull == null) {
            try {
                readFieldOrNull = Platform.readFieldOrNull(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.trustManager(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) Platform.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) Platform.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
    }
}
