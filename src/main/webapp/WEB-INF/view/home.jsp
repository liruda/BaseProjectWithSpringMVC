<form id="login" action="<c:url value='j_spring_security_check' >" method="POST" name="f">

<img id="logo" src="<c:url value=" alt="" />&gt;
<div class="row-fluid">
    <div class="span4">
        <h1>Welcome !</h1>
        <fieldset id="user-details"><label for="j_username">User Name : <span class="required">*</span></label>
        <input id="j_username" type="text" name="j_username" value="" />
        <label for="password">Password: <span class="required">*</span> </label>
        <input id="j_password" type="password" name="j_password" value="" />
        <input class="submit btn" type="submit" name="submit" value="Login" />
    </fieldset>
    </div>
    <div class="span7 offset1 well about-well">
        <h2>Sign Up Now !</h2>
        <ul class="unstyled" style="text-align: justify;">
            <li><em class="icon-tags"></em> <small> Find out the nearest store that has the cheapest price for fresh vegetables &amp; fruits before you go out for shopping !</small></li>
            <li><em class="icon-tags"></em> <small> Download our Mobile App and help us in getting the latest price from the stores near you !</small></li>
            <li><em class="icon-tags"></em> <small> Create your own shopping list before you go and buy ! </small></li>
            <li><em class="icon-tags"></em> <small> Find out how much you can save over the month before only! </small></li>
        </ul>
        <a class="btn" href="#">More &lt;&lt;</a>
    </div>
</div>
</form>
