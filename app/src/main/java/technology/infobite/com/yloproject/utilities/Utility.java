package technology.infobite.com.yloproject.utilities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import android.widget.Toast;

import technology.infobite.com.yloproject.R;
import technology.infobite.com.yloproject.avtivity.SlidingNavigation;


public class Utility {
    static String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+";
    private static ProgressDialog dialog;



    /*public static void loadSpeakerImage(Context ctx, ImageView imageView, String url) {
        Picasso.with(ctx).load(url).placeholder(R.drawable.logo_hindi).error(R.drawable.logo_hindi).into(imageView);
    }*/

    public static void toastView(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

    public static void setFragment(Fragment fragment, Context ctx, String tag) {
        ((SlidingNavigation) ctx).getSupportFragmentManager().beginTransaction().replace(R.id.home_content, fragment, tag).commit();
    }

    public static void showLoader(Context ctx) {
        dialog = new ProgressDialog(ctx);
        dialog.setCancelable(true);
        dialog.setMessage("loading..");
        dialog.show();
    }

    public static void hideLoader() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public static boolean emailCheck(String email) {
        if (email.matches(emailPattern)) {
            return true;
        } else {
            return false;
        }
    }


    public static void rateUs(Context ctx) {
        Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + ctx.getPackageName()));
        ctx.startActivity(rateIntent);
    }
}
