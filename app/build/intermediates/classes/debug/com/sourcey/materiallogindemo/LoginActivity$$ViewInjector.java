// Generated code from Butter Knife. Do not modify!
package com.sourcey.materiallogindemo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class LoginActivity$$ViewInjector<T extends com.sourcey.materiallogindemo.LoginActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492966, "field 'input_password2'");
    target.input_password2 = finder.castView(view, 2131492966, "field 'input_password2'");
    view = finder.findRequiredView(source, 2131492967, "field '_passwordText'");
    target._passwordText = finder.castView(view, 2131492967, "field '_passwordText'");
    view = finder.findRequiredView(source, 2131492968, "field '_loginButton'");
    target._loginButton = finder.castView(view, 2131492968, "field '_loginButton'");
    view = finder.findRequiredView(source, 2131492969, "field '_signupLink'");
    target._signupLink = finder.castView(view, 2131492969, "field '_signupLink'");
  }

  @Override public void reset(T target) {
    target.input_password2 = null;
    target._passwordText = null;
    target._loginButton = null;
    target._signupLink = null;
  }
}
