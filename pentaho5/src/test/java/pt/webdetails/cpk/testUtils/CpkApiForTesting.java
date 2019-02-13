/*!
* Copyright 2002 - 2019 Webdetails, a Hitachi Vantara company.  All rights reserved.
*
* This software was developed by Webdetails and is provided under the terms
* of the Mozilla Public License, Version 2.0, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to  http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package pt.webdetails.cpk.testUtils;

import org.mockito.Mockito;
import pt.webdetails.cpf.plugins.PluginsAnalyzer;
import pt.webdetails.cpk.CpkApi;
import pt.webdetails.cpk.CpkCoreService;


public class CpkApiForTesting extends CpkApi {

  public CpkApiForTesting() {
  }

  @Override
  protected void init() {
    this.cpkEnv = new CpkPentahoEnvironmentForTesting( new PluginUtilsForTesting(), reservedWords );
    this.coreService = Mockito.mock( CpkCoreService.class );
    this.pluginsAnalyzer = Mockito.mock( PluginsAnalyzer.class );
  }
}
